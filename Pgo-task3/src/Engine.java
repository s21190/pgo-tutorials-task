public class Engine {

      private    int power;
        private  int production;





        public Engine(int power, int production) {
            this.power = power;
            this.production = production;
        }
    public Engine(){


    }
        protected int getPower() {
            if (power >20000 && production > 2000) {
                System.out.println(" engine is ecological ");

                return  this.power;
            }else{

                System.out.println(" engine is not ecological ");
                return power;
            }
        }

        public int getProduction() {

            return production;
        }
    }





