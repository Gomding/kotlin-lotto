package calculator

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : FunSpec({

    context("문자열 계산기를 사용하여") {
        val stringCalculator = StringCalculator()

        test("빈 문자열을 입력하면 0을 반환한다.") {
            // when
            val result = stringCalculator.add("")

            // then
            result shouldBe 0
        }

        test("숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.") {
            // when
            val result = stringCalculator.add("12")

            // then
            result shouldBe 12
        }

        test("숫자 두개를 쉼표(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.") {
            // when
            val result = stringCalculator.add("1,2")

            // then
            result shouldBe 3
        }
    }
})
