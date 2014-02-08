        public double getCompassHeading(){
        Gyro.read();
                
        if(i < 20){
        gyroArray[i] = Gyro.getAxisZ();
        i++;
        }else {
        i = 0;
        }
        double average = 0;
        for(int j = 0; j< gyroArray.length; j++){
        
        average += gyroArray[j];
        }
        average /= 20;
        
        heading = ((heading + (average - headingOffset)*2.25*.06)) %360;
        System.out.println(average);
        return heading;
        }
