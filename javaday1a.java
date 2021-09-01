class Test {
    int roll;
    String name;
    int mark1,mark2;


    void input() {
        System.out.println("Roll no: " + roll);
        System.out.println("Name : " + name);
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
    }

     void display() {
        System.out.println("Roll no":  + roll);
        System.out.println("Name":  + name);
        System.out.println("Mark1":  + mark1);
        System.out.println("Mark2":  + mark2);
    }
}
class TestDrive {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.roll = 10;
        ob.name = Ridham;
        ob.mark1 = 90;
        ob.mark2 = 87;

        ob.input();
        ob.display();
    }
}
