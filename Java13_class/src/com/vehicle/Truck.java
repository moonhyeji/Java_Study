package com.vehicle;


public class Truck extends Car {

    /* 2. Car를 상속받는 Truck class를 만들자.
     *         기본 생성자와, 파라미터 1개짜리 생성자를 만들자.
     *         accelPedal 과 breakPedal을 overriding 하여,
     *         speed는 5씩 증감, "속도가 더 느리게 증가합니다"/"속도가 더 느리게 감소합니다"
     */
    public Truck() {
        
    }
    public Truck(int speed) {
        super(speed);
    }
    
    
    public void accelPedal() {
        System.out.println("속도가 더 빨리 증가합니다.");
        setSpeed(getSpeed() + 5);
    }
    
    
    
    public void breakPedal() {
        setSpeed(getSpeed() - 5);
        if ( getSpeed() >= 0) {
            System.out.println("속도가 줄어듭니다.");
        } else {
            System.out.println("멈췄습니다");
            setSpeed(0);
        }
    }
}
