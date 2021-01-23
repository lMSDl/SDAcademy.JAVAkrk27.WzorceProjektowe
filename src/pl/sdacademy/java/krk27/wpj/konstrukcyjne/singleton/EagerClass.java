package pl.sdacademy.java.krk27.wpj.konstrukcyjne.singleton;

public class EagerClass {

        private static final EagerClass INSTANCE = new EagerClass();

        public static EagerClass getInstance() {
            return INSTANCE;
        }

        private EagerClass() {}

        private int currentCount = 0;

        public int getCurrentCount() {
            return currentCount;
        }

        public void increment() {
            currentCount++;
        }

}
