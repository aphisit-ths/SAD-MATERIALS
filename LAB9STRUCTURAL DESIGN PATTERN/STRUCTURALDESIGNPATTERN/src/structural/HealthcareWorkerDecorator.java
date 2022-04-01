/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

/**
 *
 * @author ACER-OAT
 */
public abstract class HealthcareWorkerDecorator extends HealthcareWorker {

    private final HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker.getName(), worker.getPrice());
        this.worker = worker;
    }

    @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }

}
