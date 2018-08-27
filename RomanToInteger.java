class RomanToInteger {
    public int romanToInt(String s) {
        int iCounter = 0;
        int vCounter = 0;
        int xCounter = 0;
        int cCounter = 0;
        int mCounter = 0;
        int number = 0;
        int i = 0;
        int len = s.length();
        while(i < len){
            switch(s.charAt(i)) {
                case 'I':
                    iCounter = 1;
                    if((i+1) < len && s.charAt(i+1) == 'V'){ //4
                        number += 4;
                        i += 2; //skip the next letter
                        break;
                    }
                    if((i+1) < len && s.charAt(i+1) == 'X'){ //9
                        number += 9;
                        i += 2; //skip the next letter
                        break;
                    }
                    if((i+1) < len && s.charAt(i+1) == 'I'){ //increment 1
                        while((i+1) < len && s.charAt(i+1) == 'I'){
                            iCounter++;
                            i++;
                        }
                        number += iCounter;
                        i++; //account for counting next letter already
                        break;
                    }
                    else{ // 1
                        number += iCounter;
                        i++; //didn't count next letter
                        break;
                    }
                case 'V':
                    // if you see a V then it is 5 < x< 10
                    // using this method
                    vCounter = 5;
                    if((i+1) < len && s.charAt(i+1) == 'I'){ //increment 10
                        while((i+1) < len && s.charAt(i+1) == 'I'){
                            vCounter++;
                            i++;
                        }
                        number += vCounter;
                        i++; //account for counting next letter already
                        break;
                    }
                    else{ // 5
                        number += vCounter;
                        i++; //didn't count next letter
                        break;
                    }
                case 'X':
                    xCounter++;
                    if((i+1) < len && s.charAt(i+1) == 'L'){ //40
                        number += 40;
                        i += 2; //skip the next letter
                        break;
                    }
                    if((i+1) < len && s.charAt(i+1) == 'C'){ //90
                        number += 90;
                        i += 2; //skip the next letter
                        break;
                    }
                    if((i+1) < len && s.charAt(i+1) == 'X'){ //increment 10
                        while((i+1) < len && s.charAt(i+1) == 'X'){
                            xCounter++;
                            i++;
                        }
                        number += xCounter * 10;
                        i++; //account for counting next letter already
                        break;
                    }
                    else{ // 10
                        number += 10;
                        i++; //didn't count next letter
                        break;
                    }
                case 'L':
                    // if you see a L then it is 50+
                    // should never see a D in the middle of a number
                    // using this method
                    number += 50;
                    i++;
                    break;
                case 'C':
                    cCounter++;
                    if((i+1) < len && s.charAt(i+1) == 'D'){ //400
                        number += 400;
                        i += 2; //skip the next letter
                        break;
                    }
                    if((i+1) < len && s.charAt(i+1) == 'M'){ //900
                        number += 900;
                        i += 2; //skip the next letter
                        break;
                    }
                    if((i+1) < len && s.charAt(i+1) == 'C'){ //increment 100
                        while((i+1) < len && s.charAt(i+1) == 'C'){
                            cCounter++;
                            i++;
                        }
                        number += cCounter * 100;
                        i++; //account for counting next letter already
                        break;
                    }
                    else{ // 100
                        number += 100;
                        i++; //didn't count next letter
                        break;
                    }
                case 'D':
                    // if you see a D then it is 500+
                    // should never see a D in the middle of a number
                    // using this method
                    number += 500;
                    i++;
                    break;
                case 'M':
                    mCounter++;
                    while((i+1) < len && s.charAt(i+1) == 'M'){
                        mCounter++;
                        i++;
                    }
                    number += mCounter * 1000;
                    i++; //account for counting next letter already
                    break;
            }
        }
        return number;
    }
}
