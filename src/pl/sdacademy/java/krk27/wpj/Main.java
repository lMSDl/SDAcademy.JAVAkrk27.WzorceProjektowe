package pl.sdacademy.java.krk27.wpj;

import pl.sdacademy.java.krk27.wpj.behawioralne.chainOfResponsibility.DiscountHandler;
import pl.sdacademy.java.krk27.wpj.behawioralne.chainOfResponsibility.IDiscountHandler;
import pl.sdacademy.java.krk27.wpj.behawioralne.command.*;
import pl.sdacademy.java.krk27.wpj.behawioralne.iterator.Car;
import pl.sdacademy.java.krk27.wpj.behawioralne.iterator.ParkingLot;
import pl.sdacademy.java.krk27.wpj.behawioralne.mediator.Chat;
import pl.sdacademy.java.krk27.wpj.behawioralne.mediator.ChatEchoBot;
import pl.sdacademy.java.krk27.wpj.behawioralne.mediator.ChatUser;
import pl.sdacademy.java.krk27.wpj.behawioralne.memento.Caretaker;
import pl.sdacademy.java.krk27.wpj.behawioralne.memento.Person;
import pl.sdacademy.java.krk27.wpj.behawioralne.observer.*;
import pl.sdacademy.java.krk27.wpj.behawioralne.state.CoffeeMachine;
import pl.sdacademy.java.krk27.wpj.behawioralne.strategy.*;
import pl.sdacademy.java.krk27.wpj.behawioralne.visitor.*;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.Provider;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.ICar;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.Type;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder.Toy;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder.ToyManualBuilder;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.factoryMethod.Elevator;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.factoryMethod.IElevatorOperation;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.prototype.JavaCodeFile;
import pl.sdacademy.java.krk27.wpj.strukturalne.adapter.Circle;
import pl.sdacademy.java.krk27.wpj.strukturalne.adapter.ICircle;
import pl.sdacademy.java.krk27.wpj.strukturalne.adapter.Square;
import pl.sdacademy.java.krk27.wpj.strukturalne.adapter.SquareToCircleAdapter;
import pl.sdacademy.java.krk27.wpj.strukturalne.bridge.RedColor;
import pl.sdacademy.java.krk27.wpj.strukturalne.composite.Box;
import pl.sdacademy.java.krk27.wpj.strukturalne.composite.Product;
import pl.sdacademy.java.krk27.wpj.strukturalne.decorator.EmailNotificationDecorator;
import pl.sdacademy.java.krk27.wpj.strukturalne.decorator.INotification;
import pl.sdacademy.java.krk27.wpj.strukturalne.decorator.SmsNotificationDecorator;
import pl.sdacademy.java.krk27.wpj.strukturalne.decorator.SystemNotification;
import pl.sdacademy.java.krk27.wpj.strukturalne.facade.ToyBuilderFacade;
import pl.sdacademy.java.krk27.wpj.strukturalne.proxy.Database;
import pl.sdacademy.java.krk27.wpj.strukturalne.proxy.DatabaseProxy;
import pl.sdacademy.java.krk27.wpj.strukturalne.proxy.IDatabase;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        //new L.Test().Test(3, 5, new L.Square());
        visitior();
    }

    private static void builder() {

        /*ToyBuilder builder = new ToyBuilder();
        builder.withName("Zuzia");
        builder.withType("lalka");
        builder.withMadeOf("SDA");

        Toy toy = builder.build();*/

        String toy = new ToyManualBuilder()
                .withName("Zuzia")
                .withType("lalka")
                .withMadeOf("SDA")
                .build();

    }

    private static void facade() {
        Toy toy = new ToyBuilderFacade()
                .Properties
                    .withName("Zuzia")
                    .withType("lalka")
                    .withColor(Color.red)
                .ManufacturerInfo
                    .withMadeOf("SDA")
                    .withMinAge(3)
                .build();
    }

    private static void factoryMethod() {
        Elevator elevator = new Elevator();

        String actionType = "up";
        int floor = 6;

        IElevatorOperation action = elevator.CreateAction(actionType);
        elevator.operate(action, floor);

        actionType = "down";
        floor = 1;

        action = elevator.CreateAction(actionType);
        elevator.operate(action, floor);

        actionType = "goTo";
        floor = 1;

        action = elevator.CreateAction(actionType);
        elevator.operate(action, floor);
    }

    private static void abstractFactory() {
        Provider provider = new Provider();
        ICar car = provider.createFactory("AUDI_A4").createCombi();

        car = provider.createFactory("AUDI_A4", Type.HATCHBACK);

    }

    private static void prototype() {
        JavaCodeFile prototype = new JavaCodeFile("a", "b");
        prototype.setValues(new ArrayList<>());

        JavaCodeFile shallowClone = prototype.shallowClone();
        shallowClone.getValues().add("c");
        JavaCodeFile deepClone = prototype.deepClone();
        deepClone.getValues().add("d");
    }

    private  static  void adapter() {
        Circle circle = new Circle(5);
        Square square = new Square(8);
        System.out.println(checkCircle(circle));
        SquareToCircleAdapter squareAdapter = new SquareToCircleAdapter(square);
        System.out.println(checkCircle(squareAdapter));
    }

    private  static boolean checkCircle(ICircle circle) {
        return circle.getRadius() <= 5;
    }

    private static void bridge() {
        pl.sdacademy.java.krk27.wpj.strukturalne.bridge.Circle redCircle = new pl.sdacademy.java.krk27.wpj.strukturalne.bridge.Circle();
        redCircle.setColor(new RedColor());

        System.out.println(redCircle);
    }

    private static void composite() {
        Product phone = new Product("Phone", 1000);
        Product toy = new Product("Toy", 50);
        Product cable = new Product("Cable", 10);

        Box hall = new Box("hall");
        Box shelf3 = new Box("shelf3");
        Box shelf2 = new Box("shelf2");
        Box shelf1 = new Box("shelf1");

        hall.add(shelf1);
        hall.add(shelf2);
        hall.add(shelf3);

        for(int i = 0 ; i< 10; i++)
            shelf1.add(phone.shallowClone());

        for(int i = 0 ; i< 10; i++)
            shelf2.add(toy.shallowClone());

        for(int i = 0 ; i< 10; i++)
            shelf3.add(cable.shallowClone());

        hall.add(cable.shallowClone());

        System.out.println(hall);
        System.out.println(shelf1);
        System.out.println(phone);
    }

    private static void decorator() {
        INotification notification = new SystemNotification();

        System.out.println("SMS?");
        if(scanner.next().equals("y"))
            notification = new SmsNotificationDecorator(notification);

        System.out.println("Email?");
        if(scanner.next().equals("y"))
            notification = new EmailNotificationDecorator(notification);

        notification.send("ERROR");
    }

    private static void proxy() {
        IDatabase database = new Database();
        database = new DatabaseProxy(Database.NUMBER_OF_MAX_CONNECTIONS);

        for (int i = 1; i < 11; i++) {
            int finalI = i;
            IDatabase finalDatabase = database;
            new Thread(() -> finalDatabase.request(finalI)).start();
        }

        scanner.next();

        for (int i = 1; i < 11; i++) {
            int finalI = i;
            IDatabase finalDatabase = database;
            new Thread(() -> finalDatabase.request(finalI)).start();
        }
    }

    private static void command() {
        Garden garden = new Garden(10);
        ICommand plantTree = new GardenCommand(garden,"tree", GardenAction.PLANT);
        ICommand plantSunflower = new GardenCommand(garden,"sunflower", GardenAction.PLANT);
        ICommand removeTree = new GardenCommand(garden,"sunflower", GardenAction.REMOVE);
        ICommand removeSunflower = new GardenCommand(garden,"sunflower", GardenAction.REMOVE);

        Invoker buttonPlantTree = new Invoker(plantTree);
        Invoker buttonRemoveTree = new Invoker(removeTree);
        Invoker buttonPlantSunflower = new Invoker(plantSunflower);
        Invoker buttonRemoveSunflower = new Invoker(removeSunflower);


        buttonPlantTree.invoke();
        buttonPlantTree.invoke();
        buttonPlantTree.invoke();
        buttonPlantTree.invoke();
        buttonPlantTree.invoke();
        System.out.println(garden);

        buttonPlantSunflower.invoke();
        buttonPlantSunflower.invoke();
        buttonPlantSunflower.invoke();
        buttonPlantSunflower.invoke();
        buttonPlantSunflower.invoke();
        System.out.println(garden);


        buttonRemoveSunflower.invoke();
        buttonRemoveSunflower.invoke();
        buttonRemoveSunflower.invoke();
        buttonRemoveTree.invoke();
        buttonRemoveTree.invoke();
        System.out.println(garden);

        buttonPlantTree.invoke();
        System.out.println(garden);
        for (int i = 0; i < 16;i++)
            Invoker.undo();
        System.out.println(garden);

    }

    private static void chainOfResponsibility() {

        IDiscountHandler handler1 = new DiscountHandler("handler1", 500, 5000);
        IDiscountHandler handler2 = new DiscountHandler(handler1, "handler2", 400, 5000);
        IDiscountHandler handler3 = new DiscountHandler(handler2, "handler3", 250, 8000);
        IDiscountHandler handler4 = new DiscountHandler(handler3, "handler4", 100, 10000);

        boolean result = handler4.discount(150, 7432);
        System.out.println(result);
    }

    private static void iterator() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.add(new Car());
        parkingLot.add(new Car());
        parkingLot.add(new Car());

        for (pl.sdacademy.java.krk27.wpj.behawioralne.iterator.ICar car : parkingLot) {
            System.out.println(car.getVehicleInfo());
        }
    }

    private static void memento() {
        Person person = new Person("Ewa", "Ewowska");
        Caretaker<Person> caretaker = new Caretaker<>(person);
        caretaker.save();
        System.out.println(person);

        person.setFirstName("Monika");
        caretaker.save();
        System.out.println(person);

        person.setFirstName("Ewelina");
        System.out.println(person);

        caretaker.restoreLastState();
        System.out.println(person);

        caretaker.restoreLastState();
        System.out.println(person);

    }

    public static void strategy() {
        Calculator calculator = new Calculator();
        while (true) {
            calculator.setA(scanner.nextFloat());
            switch (scanner.next())
            {
                case "*":
                    calculator.setStrategy(new MultiplyStrategy());
                    break;
                case ":":
                    calculator.setStrategy(new DivideStrategy());
                    break;
                case "+":
                    calculator.setStrategy(new PlusStrategy());
                    break;
                case "-":
                    calculator.setStrategy(new MinusStrategy());
                    break;
                default:
                    continue;
            }
            calculator.setB(scanner.nextFloat());
            calculator.calculate();
            System.out.println("=");
            System.out.println(calculator.getResult());
        }
    }

    private static void observer() {
        Subject subject = new Subject();
        IObserver observerA = new ObserverA();
        IObserver observerB = new ObserverB();
        subject.subsctibe(observerA);
        subject.subsctibe(observerB);

        subject.someBusinessLogic();
        subject.someBusinessLogic();

        subject.unsubsctibe(observerB);

        subject.someBusinessLogic();
    }

    private static void mediator() {
        Chat chat = new Chat();
        ChatUser user = new ChatUser("User");
        ChatEchoBot bot1 = new ChatEchoBot("Bot1");
        ChatEchoBot bot2 = new ChatEchoBot("Bot2");

        user.setChat(chat);
        bot1.setChat(chat);
        bot2.setChat(chat);

        user.send("test to everyone");

        user.send("Bot1", "private test");
    }

    private  static void state() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            coffeeMachine.largeCoffee();
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            coffeeMachine.largeCoffee();
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            coffeeMachine.smallCoffee();
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(11000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            coffeeMachine.smallCoffee();
        }).start();
    }

    private static void visitior() {
        HtmlVisitor visitor = new HtmlVisitor();
        List<IElement> elements = new ArrayList<>();
        elements.add(new PlainText("plain"));
        elements.add(new PlainText("\n"));
        elements.add(new BoldText("bold"));
        elements.add(new PlainText("\n"));
        elements.add(new Hyperlink("http://some.url.com", "SomeUrl Company"));

        elements.forEach(x -> x.accept(visitor));
        System.out.println(visitor.getOutput());
    }
}
