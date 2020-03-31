/*
 * Copyright 2017 Datamountaineer.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.datamountaineer.streamreactor.connect.elastic5.indexname

import org.scalacheck.Gen
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestIndexNameFragment extends AnyFlatSpec with Matchers {

//  "TextFragment" should "return the original text when using getFragment()" in {
//    forAll(Gen.alphaStr) { someString =>
//      TextFragment(someString).getFragment shouldBe someString
//    }
//  }

  "DateTimeFragment" should "return the formatted date when using getFragment()" in new ClockFixture {
    val dateTimeFormat = "YYYY-MM-dd HH:mm:ss"
    val expectedResult = "2016-10-02 14:00:00"
    DateTimeFragment(dateTimeFormat, TestClock).getFragment shouldBe expectedResult
  }
}
