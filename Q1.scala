object rational {

    class Rational(x: Int, y: Int){
        def numer = x;
        def denom = y;

        def neg = new Rational(-this.numer, this.denom);
        override def toString(): String = numer + "/" + denom;
    }

    def main(args: Array[String]) = {

        val x = new Rational(1, 2);
        println(x.neg);
    }
}