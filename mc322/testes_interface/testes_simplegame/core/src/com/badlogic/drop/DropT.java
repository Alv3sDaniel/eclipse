package com.badlogic.drop;

import java.awt.Font;
import java.util.Iterator;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.TextArea;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class DropT extends ApplicationAdapter {
   private Texture dropImage;
   private Texture bucketImage;
   private Sound dropSound;
   private Music rainMusic;
   private SpriteBatch batch;
   private OrthographicCamera camera;
   private Rectangle bucket;
   private Array<Rectangle> raindrops;
   private long lastDropTime;
   
   //variaveis criadas para testes do trabalho
   private Rectangle _00;
   private Texture celblack;
   private Texture celwhite;
   private int tamanho_celula = 90;
   private int espacamento_celulas = 6;
   private ShapeRenderer shape;
   //private String nome = "Jonathan";
   //private int municao = 5;
   //private int sanidade = 10;  
   //private int linha = 0;
   //private int coluna = 0;
   private int turnos = 0;
   private TextArea texto;
   private BitmapFont font;
   private Array<String> msgs;
   private boolean check=false;
   public Protagonista prot;

   @Override
   public void create() {
      // load the images for the droplet and the bucket, 64x64 pixels each
      dropImage = new Texture(Gdx.files.internal("droplet.png"));
      bucketImage = new Texture(Gdx.files.internal("bucket.png"));
      
      //teste do trabalho
      celblack = new Texture(Gdx.files.internal("blackcel.png"));
      celwhite = new Texture(Gdx.files.internal("whitecel.png"));

      // load the drop sound effect and the rain background "music"
      dropSound = Gdx.audio.newSound(Gdx.files.internal("drop.wav"));
      rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));

      /*
      // start the playback of the background music immediately
      rainMusic.setLooping(true);
      rainMusic.play();
      */

      // create the camera and the SpriteBatch
      camera = new OrthographicCamera();
      camera.setToOrtho(false, 800, 480);
      batch = new SpriteBatch();
      font = new BitmapFont();
      prot = new Protagonista();
      /*msgs = new Array<>();
      msgs.add("Nome: "+nome);
      msgs.add("municao: "+municao+"/5");
      msgs.add("sanidade: "+sanidade+"/10");*/
      

      // create a Rectangle to logically represent the bucket
      bucket = new Rectangle();
      bucket.x = 800 / 2 - 64 / 2; // center the bucket horizontally
      bucket.y = 20; // bottom left corner of the bucket is 20 pixels above the bottom screen edge
      bucket.width = 64;
      bucket.height = 64;
      
      //teste do trabalho
      _00 = new Rectangle();
      _00.x = 325;
      _00.y = 100 + 3*(tamanho_celula+espacamento_celulas); 
      _00.width = tamanho_celula;
      _00.height = tamanho_celula;
      
      
      // create the raindrops array and spawn the first raindrop
      raindrops = new Array<Rectangle>();
      spawnRaindrop();
   }

   private void spawnRaindrop() {
      Rectangle raindrop = new Rectangle();
      raindrop.x = MathUtils.random(0, 800-64);
      raindrop.y = 480;
      raindrop.width = 64;
      raindrop.height = 64;
      raindrops.add(raindrop);
      lastDropTime = TimeUtils.nanoTime();
   }

   public void atualizaStatus() {
	   msgs = new Array<>();
	   msgs.add("Nome: "+prot.getNome());
	   msgs.add("municao: "+prot.getMunicao()+"/5");
	   msgs.add("sanidade: "+prot.getSanidade()+"/10");
	   msgs.add("posicao atual:("+prot.getLinha()+","+prot.getColuna()+")");
	   msgs.add("turnos: "+ turnos);
	   batch.begin();
	   for(int i = 0 ; i < msgs.size; i++) {
		   font.draw(batch, msgs.get(i), 0, 480-(20*i));
	   }
	   batch.end();
   }
   
   public void mostraInvestigacao() {
	   msgs = new Array<>();
	   String  text = "frase estupidamente grande com ambito de verificar como esta se comporta na interface grafica do trabalho";
	   //msgs.add("frase estupidamente grande com ambito de verific<br>ar como esta se comporta na interface grafica do trabalho");
	   
	   //colocar esse for para fazer o array de mensagens que o controlle passará para a interface 
	   int length = text.length();
	   for (int i = 0; i < length; i += 48) {
		   msgs.add(text.substring(i, Math.min(length, i + 48)));
	   }
	   batch.begin();
	   for(int i = 0 ; i < msgs.size; i++) {
		   font.draw(batch, msgs.get(i), 0, 380-(20*i));
	   }
	   batch.end();
   }
   
   @Override
   public void render() {
      // clear the screen with a dark blue color. The
      // arguments to clear are the red, green
      // blue and alpha component in the range [0,1]
      // of the color to be used to clear the screen.
      ScreenUtils.clear(1f, 0, 0, 1);

      // tell the camera to update its matrices.
      camera.update();

      // tell the SpriteBatch to render in the
      // coordinate system specified by the camera.
      batch.setProjectionMatrix(camera.combined);

      // begin a new batch and draw the bucket and
      // all drops
      
      batch.begin();
      //cria tabuleiro
      for(int linha = 0; linha < 5; linha++) {
    	  for(int coluna = 0; coluna < 5; coluna++) {
    		  batch.draw(celblack, _00.x+(coluna*(tamanho_celula+espacamento_celulas)), _00.y-(linha*(tamanho_celula+espacamento_celulas)));
    	  }
      }
      
      /*batch.draw(bucketImage, bucket.x, bucket.y);
      for(Rectangle raindrop: raindrops) {
         batch.draw(dropImage, raindrop.x, raindrop.y);
      }*/
      batch.end();

      // process user input
      if(Gdx.input.isTouched()) {
         Vector3 touchPos = new Vector3();
         touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
         camera.unproject(touchPos);
         bucket.x = touchPos.x - 64 / 2;
      }
      if(Gdx.input.isKeyJustPressed(Keys.LEFT)) bucket.x -= 400 * Gdx.graphics.getDeltaTime();
      if(Gdx.input.isKeyJustPressed(Keys.RIGHT)) bucket.x += 400 * Gdx.graphics.getDeltaTime();
      if(Gdx.input.isKeyJustPressed(Keys.DOWN)) bucket.y -= 400 * Gdx.graphics.getDeltaTime();
      if(Gdx.input.isKeyJustPressed(Keys.UP)) bucket.y += 400 * Gdx.graphics.getDeltaTime();
      //if(Gdx.input.isKeyJustPressed(Keys.T)) ScreenUtils.clear(1, 1, 1, 1);
      
      //controle de teste do trabalho
      batch.begin();
      if(Gdx.input.isKeyJustPressed(Keys.E)) {
    	  if(prot.getMunicao() > 0) {
    		  batch.draw(celwhite, _00.x + ((tamanho_celula+espacamento_celulas)*prot.getColuna()), _00.y - ((tamanho_celula+espacamento_celulas) * prot.getLinha()));
    		  prot.setMunicao(prot.getMunicao()-1);  
    		  check = true;
    	  }
      }
      batch.end();
      if(Gdx.input.isKeyJustPressed(Keys.W)) {
    	  if(prot.getLinha() > 0) {
    		  prot.setLinha(prot.getLinha()-1);
    		  prot.setSanidade(prot.getSanidade()-1);
    		  turnos++;
    		  check = false;
    	  }
      }
      if(Gdx.input.isKeyJustPressed(Keys.S)) {
    	  if(prot.getLinha() < 5) {
    		  prot.setLinha(prot.getLinha()+1);
    		  prot.setSanidade(prot.getSanidade()-1);
    		  turnos++;
    		  check = false;
    	  }
      }
      
      if(Gdx.input.isKeyJustPressed(Keys.A)) {
    	  if(prot.getColuna() > 0) {
    		  prot.setColuna(prot.getColuna()-1);
    		  prot.setSanidade(prot.getSanidade()-1);
    		  turnos++;
    		  check = false;
    	  }
      }
      if(Gdx.input.isKeyJustPressed(Keys.D)) {
    	  if(prot.getColuna() < 5) {
    		  prot.setColuna(prot.getColuna()+1);
    		  prot.setSanidade(prot.getSanidade()-1);
    		  turnos++;
    		  check = false;
    	  }
      }
      
      if(Gdx.input.isKeyJustPressed(Keys.X)) {
    	  prot.setSanidade(10);
    	  turnos++;
      }
      
      if(Gdx.input.isKeyPressed(Keys.Z)) {
    	  check = true;
      }
      
      if(check) {
    	  mostraInvestigacao();
      }
      atualizaStatus();
      
      /*
      // make sure the bucket stays within the screen bounds
      if(bucket.x < 0) bucket.x = 0;
      if(bucket.x > 800 - 64) bucket.x = 800 - 64;
      if(bucket.y < 0) bucket.y = 0;
      if(bucket.y > 480 - 64) bucket.y = 480 - 64;
      
      // check if we need to create a new raindrop
      if(TimeUtils.nanoTime() - lastDropTime > 1000000000) spawnRaindrop();

      // move the raindrops, remove any that are beneath the bottom edge of
      // the screen or that hit the bucket. In the latter case we play back
      // a sound effect as well.
      for (Iterator<Rectangle> iter = raindrops.iterator(); iter.hasNext(); ) {
         Rectangle raindrop = iter.next();
         raindrop.y -= 200 * Gdx.graphics.getDeltaTime();
         if(raindrop.y + 64 < 0) iter.remove();
         if(raindrop.overlaps(bucket)) {
            dropSound.play();
            iter.remove();
         }
      }*/
   }

   @Override
   public void dispose() {
      // dispose of all the native resources
      dropImage.dispose();
      bucketImage.dispose();
      dropSound.dispose();
      rainMusic.dispose();
      batch.dispose();
   }
}