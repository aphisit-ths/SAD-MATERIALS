/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {

    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        //Decorate {worker name} with TimeLogging.
        super(worker);
        System.out.println("Decorate " + worker.getName() + " with TimeLogging.");
    }

    @Override
    public void service() {
        LocalDateTime myDateObj = LocalDateTime.now();
        // {Datetime}: {worker name with service} .
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(dateFormat);

        System.out.print(formattedDate + " : ");
        super.service();
    }

}
