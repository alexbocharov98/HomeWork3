public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sumBoxers = boxer1 + boxer2;
        System.out.println(sumBoxers);
        var difBoxer = boxer1 - boxer2;
        System.out.println(difBoxer);

        var overload = boxer2 % boxer1;
        System.out.println(overload);

        var allTime = 640;
        var peopleTime = 8;
        var people = allTime / peopleTime;
        System.out.println("Всего работников в компании- " + people + " человек");

        people = people + 94;
        allTime = people * peopleTime;
        System.out.println("Если в компании работает " + people + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");







    }
}