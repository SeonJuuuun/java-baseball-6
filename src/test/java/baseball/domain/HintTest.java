package baseball.domain;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HintTest {

	@Test
	void isStrikeCountZero_메서드는_strike가_0이면_true를_반환한다() {
		Hint hint = new Hint(0, 2);
		assertTrue(hint.isStrikeCountZero());
	}
}