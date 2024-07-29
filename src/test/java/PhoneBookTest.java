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
    int result = book.add(name, number);
    //then
    Assertions.assertEquals(result,number);
}
@Test
    public void findByNumber (){
        //given
    PhoneBook book = new PhoneBook();
    int number = 1234567890;
    String name = "abcdefg";
    //then
    book.add(name,number);
    String result = book.findByNumber(number);
    //then
    Assertions.assertEquals(name,result);
}
}
