package com.wan.test2;

/**
 * Created by lidonggen on 2018/3/1.
 */
public class Even {
    //事件对象
        private Person person;

        public Even(Person person) {

            this.person = person;
        }

        public Even() {
            super();
        }

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }
}
