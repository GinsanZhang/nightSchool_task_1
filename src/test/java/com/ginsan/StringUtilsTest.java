package com.ginsan;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class StringUtilsTest {

    private   StringUtils stringUtils;
    @Before
    public void setUp() throws Exception {
        stringUtils = new StringUtils("");
    }

    @Test
    public void should_be_empty_when_string_is_empty() {
        // given
        // when
        // then
        assertThat(stringUtils.isEmpty("")).isTrue();
    }

    @Test
    public void should_be_empty_when_string_is_null() {
        // given
        // when
        // then
        assertThat(stringUtils.isEmpty(null)).isTrue();
    }

    @Test
    public void should_not_be_empty_when_string_has_char() {
        // given
        String empty = "";
        // when
        // then
        assertThat(stringUtils.isEmpty("name")).isFalse();
    }

    @Test
    public void should_be_blank_when_string_is_empty() {
        // given
        // when
        // then
        assertThat(stringUtils.isBlank("")).isTrue();
    }
    @Test
    public void should_be_blank_when_string_is_null() {
        // given
        // when
        // then
        assertThat(stringUtils.isBlank(null)).isTrue();
    }

    @Test
    public void should_be_blank_when_string_is_space() {
        // given
        // when
        // then
        assertThat(stringUtils.isBlank(" ")).isTrue();
    }

    @Test
    public void should_be_blank_when_string_is_tab() {
        // given
        // when
        // then
        assertThat(stringUtils.isBlank("    ")).isTrue();
    }
    @Test
    public void should_not_be_blank_when_string_has_none_blank_char() {
        // given
        // when
        // then
        assertThat(stringUtils.isBlank("name")).isFalse();
    }
    @Test
    public void should_not_be_alpha_when_string_is_empty() {
        // given
        // when
        // then
        assertThat(stringUtils.isAlpha("")).isFalse();
    }


    @Test
    public void should_not_be_alpha_when_string_has_no_letter() {
        // given
        // when
        // then
        assertThat(stringUtils.isAlpha("1231+")).isFalse();
    }

    @Test
    public void should_be_alpha_when_string_ony_contains_letter() {
        // given
        // when
        // then
        assertThat(stringUtils.isAlpha("thisIsaTest")).isTrue();
    }
}