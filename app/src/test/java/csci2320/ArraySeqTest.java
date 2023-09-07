package csci2320;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraySeqTest {
  private ArraySeq<Object> seq;

  @BeforeEach void makeArraySeq() {
    seq = new ArraySeq<>();
  }

  @Test void emptyOnCreate() {
    assertEquals(0, seq.size());
  }

  @Test void sizeCheck(){
    seq.add(4);
    seq.add(5);
    seq.add(9);
    assertEquals(3,seq.size());
  }

  @Test void addingObjects(){
    seq.add(5);
    seq.add(6);
    assertEquals(2,seq.size());
  }
  @Test void addingManyThings(){
    for(int i = 0; i < 5000; i++){
      seq.add(i);
    }
    assertEquals(5000,seq.size());
  }

  @Test void addingMultipleTypes(){
    seq.add(5);
    seq.add("HI");
    seq.add(40.243);
    assertEquals(3, seq.size());
  }

  @Test void gettingObjects(){
    seq.add(5);
    seq.add(7);
    seq.add(20);
    assertEquals(5,seq.get(0));
    assertEquals(7,seq.get(1));
    assertEquals(20,seq.get(2));
  }

  @Test void settingObjects(){
    seq.add(5);
    seq.add(7);
    seq.add(20);
    seq.set(1,6);
    assertEquals(6,seq.get(1));
  }

    @Test void insertingObjects(){
    seq.add(5);
    seq.add(7);
    seq.add(20);
    seq.insert(1,6);
    assertEquals(6,seq.get(1));
    assertEquals(7,seq.get(2));
    assertEquals(20,seq.get(3));
  }

    @Test void removingObjects(){
    seq.add(5);
    seq.add(7);
    seq.add(20);
    seq.remove(1);
    assertEquals(20,seq.get(1));
    assertEquals(2,seq.size());
  }
}
