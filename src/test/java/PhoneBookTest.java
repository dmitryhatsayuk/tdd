import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void add() {
    //given
    PhoneBook book = new PhoneBook();
    String name = "abcdefg";
    Integer number = 1234567890;
    //when
    int result = book.add(number, name);
    //then
    Assertions.assertEquals(result,number);
}
@Test
    public void findByNumber (){
        //given
    PhoneBook book = new PhoneBook();
    int number = 1234567890;
    String name = "abcdefg";
    //when
    book.add(number,name);
    String result = book.findByNumber(number);
    //then
    Assertions.assertEquals(name,result);
}
@Test
    public void findByName () {
//given
    PhoneBook book = new PhoneBook();
    String name= "abcdefg";
    int number = 1234567890;
    book.add(number,name);
    //when
    int result= book.findByName(name);
    //then
    Assertions.assertEquals(number,result);
    }
@Test
    public void printAllNames(){
        //given
    PhoneBook book = new PhoneBook();
    book.add(456,"def");
    book.add(123,"abc");

    //when
    String result = book.printAllNames();
    //then
    Assertions.assertEquals(result,"abc def");
}
}
