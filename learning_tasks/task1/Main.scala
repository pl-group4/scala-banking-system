object Task1 extends App {
  def createIntegerArray(): Array[Int] = {
    val array = new Array[Int](50);

    for (index <- 0 to 49) {
      array(index) = index + 1;
    }

    return array;
  }

  createIntegerArray().foreach { println };

  def sumIntegerArray(array: Array[Int]): Int = {
    var sum = 0;

    for (index <- 0 to (array.length - 1)) {
      sum += array(index);
    }

    return sum;
  }

  println(sumIntegerArray(createIntegerArray()));
}