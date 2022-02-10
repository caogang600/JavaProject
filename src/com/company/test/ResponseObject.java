package com.company.test;

public class ResponseObject <T> extends BaseData {
        private T valueOne;
        private T valueTwo;

        public ResponseObject(T valueOne, T valueTwo) {
            this.valueOne = valueOne;
            this.valueTwo = valueTwo;
        }

        public T getValueOne() {
            return valueOne;
        }

        public void setValueOne(T valueOne) {
            this.valueOne = valueOne;
        }

        public T getValueTwo() {
            return valueTwo;
        }

        public void setValueTwo(T valueTwo) {
            this.valueTwo = valueTwo;
        }

        public static void main(String[] args) {
            ResponseObject<String> object = new ResponseObject<>("String one!", "String two");
            System.out.println("value one " + object.valueOne + " value two " + object.valueTwo);
        }
}
