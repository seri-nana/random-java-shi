void setup() {
  leapYear(200);
}

void circleFunc (int x, int y, int s) {
  if (x > y) {
    circle(x, y, s);
  }
  else if (x < y) {
    ellipse (x, y, s, s * s);
  }
  else {
    return;
  }
}

void groups (int a) {
  if (a % 4 == 0) {
    println(a / 4);
    println(4);
  }
  if (a % 3 == 0) {
    println(a / 3);
    println(3);
  }
}

void leapYear(int year) {
  if (year % 400 == 0) {
    println("Leap year");
  }
  else if (year % 100 == 0) {
    println("Not a leap year");
  }
  else if (year % 4 == 0) {
    println("Leap year");
  }
  else {
    println("Not a leap year");
  }
}
