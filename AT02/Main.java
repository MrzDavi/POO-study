

abstract class Main {
        public int a = 1;
        public int b = 2;
        public abstract void calcula();
      }
      

      class Subtração extends Main {

        public void calcula() { 
          System.out.println(a - b);
        }
    }

        class Soma extends Main {
            
            public void calcula() {
              System.out.println(a + b);
            }
        }
            
     
        class Multiplica extends Main {
        public void calcula() { 
          System.out.println(a * b);     
        } 
    }

        class Divide extends Main {
            public void calcula() { 
              System.out.println(a/b);
            }



        }       
