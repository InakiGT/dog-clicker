package com.example.servingwebcontent;

public class Dogs {
    private static Dogs instance = new Dogs(0);
    public Dog dog;
    public Dog[] dogs;

    public Dogs(int id) {
        Dog[] dogs = {
            new Dog(0, "Max", "https://hips.hearstapps.com/ghk.h-cdn.co/assets/16/08/gettyimages-530330473.jpg?crop=0.659xw:0.990xh;0.123xw,0.00779xh&resize=980:*"),
            new Dog(1, "Bella", "https://www.hartz.com/wp-content/uploads/2022/04/small-dog-owners-1.jpg"),
            new Dog(2, "Charlie", "https://www.thesprucepets.com/thmb/hxWjs7evF2hP1Fb1c1HAvRi_Rw0=/2765x0/filters:no_upscale():strip_icc()/chinese-dog-breeds-4797219-hero-2a1e9c5ed2c54d00aef75b05c5db399c.jpg"),
            new Dog(3, "Lucy", "https://www.thesprucepets.com/thmb/y4YEErOurgco9QQO-zJ6Ld1yVkQ=/3000x0/filters:no_upscale():strip_icc()/english-dog-breeds-4788340-hero-14a64cf053ca40f78e5bd078b052d97f.jpg"),
            new Dog(4, "Cooper", "https://hgtvhome.sndimg.com/content/dam/images/hgtv/fullset/2022/6/16/1/shutterstock_1862856634.jpg.rend.hgtvcom.1280.853.suffix/1655430860853.jpeg")
        };
        this.dogs = dogs;
        this.dog = dogs[id];
    }

    public void SetDog(int id) {
        this.dog = dogs[id];
    }

    public static Dogs getInstance() {
        return instance;
    }
}