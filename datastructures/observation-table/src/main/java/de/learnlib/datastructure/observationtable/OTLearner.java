/* Copyright (C) 2013-2021 TU Dortmund
 * This file is part of LearnLib, http://www.learnlib.de/.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.learnlib.datastructure.observationtable;

import de.learnlib.api.algorithm.LearningAlgorithm;
import de.learnlib.api.algorithm.MultipleHypothesesLearningAlgorithm;
import net.automatalib.automata.fsa.DFA;
import net.automatalib.automata.oca.ROCA;
import net.automatalib.automata.oca.VCA;
import net.automatalib.automata.transducers.MealyMachine;
import net.automatalib.words.Word;

public interface OTLearner<M, I, D> extends LearningAlgorithm<M, I, D>, ObservationTableFeature<I, D> {

    interface OTLearnerDFA<I> extends DFALearner<I>, OTLearner<DFA<?, I>, I, Boolean> {}

    interface OTLearnerMealy<I, O> extends MealyLearner<I, O>, OTLearner<MealyMachine<?, I, ?, O>, I, Word<O>> {}

    interface OTLearnerROCA<I> extends MultipleHypothesesLearningAlgorithm.ROCALearner<I>, OTLearner<ROCA<?, I>, I, Boolean> {}

    interface OTLearnerVCA<I> extends MultipleHypothesesLearningAlgorithm.VCALearner<I>, OTLearner<VCA<?, I>, I, Boolean> {}
}
