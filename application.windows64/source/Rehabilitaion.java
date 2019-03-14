import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Rehabilitaion extends PApplet {

int rs1 = 50;
float x = 0;
float y = 0;
float angle = 0;

public void setup(){
    
  rectMode(CENTER);
  colorMode(HSB, 100);
  frameRate(60);
  
}

public void draw(){
  //x = cos(abs(radians(angle)));
  //y = sin(abs(radians(angle)));
  
  background(99);
  noStroke();
  for(int i=0;i<10;i++){
   for(int j=0;j<10;j++){
     x = cos(abs(radians(angle - i * 10 - j *10)));
     fill(10 * i, 10 + j * 10, 99);
     rect(rs1 + i * 100,rs1 + j * 100,rs1 * x,rs1 * x); 
     
   }
  }
  angle = angle + 1;
}
  public void settings() {  size(1000,1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Rehabilitaion" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
