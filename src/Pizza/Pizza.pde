import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch
void setup(){
  size (1000,1000);
  minim = new Minim(this);      //in the setup method
sound = minim.loadFile("Ding.mp3");      //in the setup method

}
void draw (){
  fill(255,200,150);
  ellipse(300,300,300,300);
  fill(255,0,0);
  ellipse(300,300,280,280);
  fill(250,255,0);
  ellipse(300,300,270,270);
  PImage curly = loadImage("curly.ppm.gif");
  if(mousePressed){
    sound.play();
    sound.rewind();
  image(curly, 300,300);
  image (curly, 200,200);
  image (curly, 220,320);
  image (curly, 340, 250);
  }
}