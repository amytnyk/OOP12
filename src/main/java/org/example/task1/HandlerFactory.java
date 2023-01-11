package org.example.task1;

public enum HandlerFactory {
    FIVE(5),
    TWENTY(20),
    FIFTY(50);

    private final int value;

    HandlerFactory(int value) {
        this.value = value;
    }

    public Handler build() {
        return new Handler() {
            private Handler nextHandler;

            @Override
            public void setNext(Handler handler) {
                nextHandler = handler;
            }

            @Override
            public void process(int price) {
                if (nextHandler != null)
                    nextHandler.process(price % value);
                else if (price % value != 0)
                    throw new IllegalArgumentException();
                System.out.println(price / value + " * " + value);
            }
        };
    }
}
