package easy;

public class robotReturnToOriginal {
    public boolean judgeCircle(String moves) {
        int[] controlArray= {0,0};
        char C;

        for(int i= 0; i < moves.length(); i++){
            C = moves.charAt(i);
            if( C == 'U' || C == 'D'){
                if( C == 'U'){
                   controlArray[0] = controlArray[0] +1;
                }
                else{
                    controlArray[0] = controlArray[0] -1;
                }
            }
            else{
                if( C == 'R'){
                    controlArray[1] = controlArray[1] +1;
                }
                else{
                    controlArray[1] = controlArray[1] -1;
                }
            }
        }

        boolean result = controlArray[0] == 0 && controlArray[1] == 0;

    return result;
    }

}
