class Dog{
    String name;

    public static void main(String[]args){
        Dog dog1 = new Dog();
        //dog1.bark();
        dog1.name = "Fred";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name="Fido";
        myDogs[1].name="Lassy";

        System.out.print("Nome do último cão é : ");
        System.out.println(myDogs[2].name);

        int x = 0 ;

        while( x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }

    }

        public void bark() {
            System.out.println( name + " : ruff fufff Ruff");
            
        }


    }

