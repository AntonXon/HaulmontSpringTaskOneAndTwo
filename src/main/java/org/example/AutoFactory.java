package org.example;

import org.example.dto.Car;
import org.example.events.CarEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;
    private CarChecker carChecker;
    private CarEventPublisher carEventPublisher;

    @Autowired
    public AutoFactory(@Qualifier("sedanPL") ProductionLine productionLine, CarChecker carChecker, CarEventPublisher carEventPublisher) {
        this.productionLine = productionLine;
        this.carChecker = carChecker;
        this.carEventPublisher = carEventPublisher;
    }

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
    }

    public int runProduction(){
        int carsBuilt = 0;
        while (carsBuilt < productionSize){
            Car car = productionLine.work();
            if (carChecker.checkCar(car)){
                carsBuilt++;
                carEventPublisher.publishCarEvent("Car is built properly");
            } else {
                carEventPublisher.publishCarEvent("Car is not build properly");
            }
        }
        return carsBuilt;
    }

    public int getProductionSize() {
        return productionSize;
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

    @PostConstruct
    public void initMethod(){
        productionSize = 5;
        System.out.println("autoFactory ready to work");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("autoFactory work finished");
    }
}
