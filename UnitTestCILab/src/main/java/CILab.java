public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        char[] myCharArray = myString.toCharArray();
        if(myString.equals(myString.toUpperCase()))
            return true;
        else if(myString.equals(myString.toLowerCase()))
            return true;
        else if(Character.isUpperCase(myCharArray[0]))
            return true;
        return false;
    }
}

