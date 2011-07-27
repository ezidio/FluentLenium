package fr.java.freelance.fluentlenium.filter;

import fr.java.freelance.fluentlenium.filter.localTest.LocalFluentTest;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class StateOnElementTest extends LocalFluentTest {

    @Test
    public void checkIsEnabled() {
        goTo(DEFAULT_URL);
        assertThat($("input").first().isEnabled()).isTrue();
    }

    @Test
    public void checkIsDisplayed() {
        goTo(DEFAULT_URL);
        assertThat($("input").first().isDisplayed()).isTrue();
    }

    @Test
    public void checkIsNotSelected() {
        goTo(DEFAULT_URL);
        assertThat($("input").first().isSelected()).isFalse();
    }

    @Test
    public void checkIsSelected() {
        goTo(DEFAULT_URL);
        assertThat($("#selected").first().isSelected()).isTrue();
    }

    @Test
    public void checkIsDisabled() {
        goTo(DEFAULT_URL);
        assertThat($("#disabled").first().isSelected()).isFalse();
    }

    @Test
    public void checkIsNonDisplay() {
        goTo(DEFAULT_URL);
        assertThat($("#non_display").first().isDisplayed()).isFalse();
    }


}
