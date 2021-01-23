package pl.sdacademy.java.krk27.wpj.konstrukcyjne.singleton;

public enum EagerEnum {
        INSTANCE;

        private int currentCount = 0;

        public int getCurrentCount() {
            return currentCount;
        }

        public void increment() {
            currentCount++;
        }
}
