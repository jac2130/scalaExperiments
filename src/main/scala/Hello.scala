object Experiments extends Application {
  def encode(n: Int, f: (Int) => Long): Long = {
    val x = n * 10
    f(x)
  }
  println("encode(100, (x: Int)=> x + 100): Long")
  println(encode(100, (x: Int) => x + 100): Long)
  println("encode(100, (x: Int)=> x*5): Long")
  println(encode(100, (x: Int)=> x*5): Long)

}
