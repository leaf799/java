package ru.mirea.uibo1.kaburgan.pr_4.number_4;

import ru.mirea.uibo1.kaburgan.pr_4.number_4.other.*;

public class ComputerTest {
    public static void main(String[] args) {
        Computer pc = new Computer(
                Brand.ASUS,
                new Processor("Intel i7", 3.5),
                new Memory(16),
                new Monitor(27)
        );
        System.out.println(pc);
    }
}

