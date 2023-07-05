package com.qianrui.a01innerclassdemo1;

public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public Car() {
    }

    public Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    /**
     * 获取
     * @return carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * 设置
     * @param carName
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * 获取
     * @return carAge
     */
    public int getCarAge() {
        return carAge;
    }

    /**
     * 设置
     * @param carAge
     */
    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    /**
     * 获取
     * @return carColor
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * 设置
     * @param carColor
     */
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    class Engine{
        String engineName;
        int engineAge;

        public Engine() {
        }

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        public void show(){
            //内部类可以直接访问外部类的成员，包括私有
            System.out.println(engineName);
            System.out.println(carName);
        }

        /**
         * 获取
         * @return engineName
         */
        public String getEngineName() {
            return engineName;
        }

        /**
         * 设置
         * @param engineName
         */
        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        /**
         * 获取
         * @return engineAge
         */
        public int getEngineAge() {
            return engineAge;
        }

        /**
         * 设置
         * @param engineAge
         */
        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }
    }

    public void show(){
        System.out.println(carName);
        //错误
        /*
        System.out.println(engineName);
        */

        //如需使用,应该进行创建对象
        Engine e = new Engine();
        System.out.println(e.getEngineName());
    }
}
