abstract class PairMap{
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap{
    private int num;

    public Dictionary(int capacity){
        keyArray = new String[capacity];
        valueArray = new String[capacity];
        num = 0;
    }
    public String get(String key){
        for (int i = 0; i < num; i++) {
            if (keyArray[i].equals(key)) {
                return valueArray[i];
            }
        }
        return null;
    }
    public void put(String key, String value){
        boolean isExist = false;
        for(int i = 0; i < num; i++){
            if(keyArray[i].equals(key)) {
                valueArray[i] =value;
                isExist = true;
            }
        }
        if(!isExist && num < keyArray.length){
            keyArray[num] = key;
            valueArray[num] = value;
            num++;
        }
    }
    public String delete(String key){
        for(int i = 0; i < num; i++){
            if(keyArray[i].equals(key)) {
                String deleteItem = valueArray[i];
                for(int j = i; j< num-1; j++){
                    keyArray[j] = keyArray[j+1];
                    valueArray[j] =valueArray[j+1];
                }
                keyArray[num - 1] = null;
                valueArray[num - 1] = null;
                num--;
                return deleteItem;
            }
        }
        return null;
    }
    public int length(){
        return num;
    }
}
public class DictionaryApp {
    public static void main(String[] args){
        Dictionary dic = new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문","파이썬");
        dic.put("이재문","C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
