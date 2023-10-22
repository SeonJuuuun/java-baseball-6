package baseball.domain;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HintTest {

	@Test
	void isStrikeCountZero_메서드는_strike가_0이면_true를_반환한다() {
		Hint hint = new Hint(0, 2);
		assertTrue(hint.isStrikeCountZero());
	}

	@Test
	void isNotStrikeCountZero_메서드는_strike가_0이_아니면_true를_반환한다() {
		Hint hint = new Hint(1, 2);
		assertTrue(hint.isNotStrikeCountZero());
	}

	@Test
	void isBallCountZero_메서드는_ball이_0이면_true를_반환한다() {
		Hint hint = new Hint(1, 0);
		assertTrue(hint.isBallCountZero());
	}

	@Test
	void isBallCountZero_메서드는_ball이_0이_아니면_true를_반환한다() {
		Hint hint = new Hint(1, 1);
		assertTrue(hint.isNotBallCountZero());
	}

	@Test
	void isThreeStrike_메서드는_strike가_3이면_true를_반환한다() {
		Hint hint = new Hint(3, 0);
		assertTrue(hint.isThreeStrike());
	}
}
