object rational {

    class Rational(x: Int, y: Int){
        def numer = x;
        def denom = y;

        def add(r: Rational) = {
            new Rational(numer * r.denom + denom * r.numer, denom * r.denom);
        }
        def neg = new Rational(-this.numer, this.denom);
        override def toString(): String = numer + "/" + denom;
    }

    def main(args: Array[String]) = {

        val x = new Rational(3, 4);
        val y = new Rational(5, 8);
        val z = new Rational(2, 7);
        // println(x.neg);
        println(x.add(y.neg).add(z.neg));
    }
    
    
}