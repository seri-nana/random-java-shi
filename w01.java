float x = 250;
float y = 250;

size(500, 500);
background(220, 0, 0);


fill(255, 200, 0);
noStroke();
triangle(x - 70, y + 70, x - 40, y - 60, x, y + 70);
triangle(x, y + 70, x + 40, y - 60, x + 70, y + 70);

fill(220, 0, 0);
noStroke();
triangle(x - 60, y + 70, x - 40, y - 10, x - 10, y + 70);
triangle(x + 10, y + 70, x + 40, y - 10, x + 60, y + 70);
