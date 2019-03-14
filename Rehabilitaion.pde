int rs1 = 50;
float x = 0;
float y = 0;
float angle = 0;

void setup(){
  size(1000,1000);  
  rectMode(CENTER);
  colorMode(HSB, 100);
  frameRate(60);
  
}

void draw(){
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
