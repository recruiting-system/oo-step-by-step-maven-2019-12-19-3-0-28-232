//package com.thoughtworks.practice08;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//
//public class Practice08Test {
//    private Klass klass;
//
//    @Before
//    public void setup() {
//        klass = new Klass(2);
//    }
//
//    @Test
//    public void should_person_have_id_name_and_age() {
//        Person person = new Person(1, "Tom", 21);
//
//        assertEquals("Tom", person.getName());
//        assertEquals(21, person.getAge());
//    }
//
//    @Test
//    public void should_person_with_same_id_be_same_one() {
//        Person person1 = new Person(1, "Tom", 21);
//        Person person2 = new Person(1, "Tom", 21);
//
//        assertEquals(person1, person2);
//    }
//
//    @Test
//    public void should_person_have_an_introduce_method_which_introduce_person_with_name_and_age() {
//        Person tom = new Person(1, "Tom", 21);
//        String introduce = tom.introduce();
//
//        assertEquals("My name is Tom. I am 21 years old.", introduce);
//    }
//
//    @Test
//    public void should_class_have_a_number() {
//        assertEquals(2, klass.getNumber());
//    }
//
//    @Test
//    public void should_class_get_display_name() {
//        assertEquals("Class 2", klass.getDisplayName());
//    }
//
//    @Test
//    public void should_class_assign_a_leader() {
//        Student jerry = new Student(1, "Jerry", 8, klass);
//        klass.assignLeader(jerry);
//
//        assertEquals(jerry, klass.getLeader());
//    }
//
//    @Test
//    public void should_student_have_name_age_and_class_number() {
//        Student tom = new Student(1, "Tom", 21, klass);
//
//        assertEquals("Tom", tom.getName());
//        assertEquals(21, tom.getAge());
//        assertEquals(klass, tom.getKlass());
//    }
//
//    @Test
//    public void should_student_introduce_with_class() {
//        Student tom = new Student(1, "Tom", 21, klass);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Student. I am at Class 2.", tom.introduce());
//    }
//
//    @Test
//    public void should_student_introduce_itself_as_class_leader() {
//        Student tom = new Student(1, "Tom", 21, klass);
//        klass.assignLeader(tom);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.", tom.introduce());
//    }
//
//    @Test
//    public void should_teacher_have_name_and_age_and_class() {
//        Teacher tom = new Teacher(1, "Tom", 21, klass);
//
//        assertEquals("Tom", tom.getName());
//        assertEquals(21, tom.getAge());
//        assertEquals(klass, tom.getKlass());
//    }
//
//    @Test
//    public void should_teacher_introduce_itself_with_which_class_it_teaches() {
//        Teacher tom = new Teacher(1, "Tom", 21, klass);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.", tom.introduce());
//    }
//
//    @Test
//    public void should_teacher_introduce_itself_with_no_class_teaching() {
//        Teacher tom = new Teacher(1, "Tom", 21);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.", tom.introduce());
//    }
//
//    @Test
//    public void should_teacher_introduce_a_student_it_teaches() {
//        Teacher tom = new Teacher(1, "Tom", 21, klass);
//        Student jerry = new Student(1, "Jerry", 8, klass);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.", tom.introduceWith(jerry));
//    }
//
//    @Test
//    public void should_teacher_introduce_a_student_it_does_not_teach() {
//        Teacher tom = new Teacher(1, "Tom", 21, new Klass(1));
//        Student jerry = new Student(1, "Jerry", 8, new Klass(2));
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.", tom.introduceWith(jerry));
//    }
//}
