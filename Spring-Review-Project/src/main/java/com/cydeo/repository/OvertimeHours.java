package com.cydeo.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component

public class OvertimeHours implements HoursRepository {


        @Override
        public int getHours() {
            return 15;
        }

}

