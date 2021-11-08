package myproject.graduation.web;

import myproject.graduation.model.*;

import java.time.LocalDate;

public class TestData {
    public static final MatcherFactory.Matcher<User> USER_MATCHER = MatcherFactory.usingIgnoringFieldsComparator(User.class, "registered", "password");
    public static final MatcherFactory.Matcher<Restaurant> RESTAURANT_MATCHER = MatcherFactory.usingEqualsComparator(Restaurant.class);
    public static final MatcherFactory.Matcher<Menu> MENU_MATCHER = MatcherFactory.usingIgnoringFieldsComparator(Menu.class);
    public static final MatcherFactory.Matcher<Voice> VOICE_MATCHER = MatcherFactory.usingEqualsComparator(Voice.class);



    public static final int USER_ID = 2;
    public static final int ADMIN_ID = 1;
    public static final int RESTAURANT_ID = 1;
    public static final int MENU_ID = 1;
    public static final String USER_MAIL = "user@yandex.ru";
    public static final String ADMIN_MAIL = "admin@gmail.com";

    public static final User user = new User(USER_ID, "User", USER_MAIL, "password", Role.USER);
    public static final User admin = new User(ADMIN_ID, "Admin", ADMIN_MAIL, "admin", Role.ADMIN, Role.USER);
    public static final Restaurant rest = new Restaurant(1,"Kebab", "Lithuania", "+375882558899");
    public static final Menu menu = new Menu(1, LocalDate.of(2021, 10, 10));


}