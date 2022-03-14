class Cars {
    static int noOfWheels = 4;
     void message(){
        System.out.println("We are cars");
    }

}

class bmw extends Cars{
void message(){
    System.out.println("We are bmw cars");
}
}

class mercedes extends Cars{
    void message(){
        System.out.println("we are mercedes cars");
    }
}

class print{
    public static void main(String[] args){
       bmw c = new bmw();
        mercedes d = new mercedes();
        Cars a = new Cars();
        System.out.println(Cars.noOfWheels);
        c.message();
        System.out.println(bmw.noOfWheels);
        d.message();
        a.message();

    }
}
