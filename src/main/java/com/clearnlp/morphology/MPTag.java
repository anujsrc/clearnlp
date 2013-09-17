/**
* Copyright 2013 IPSoft Inc.
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*   http://www.apache.org/licenses/LICENSE-2.0
*   
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.clearnlp.morphology;

import com.clearnlp.util.UTArray;

/**
 * @since 1.5.0
 * @author Jinho D. Choi ({@code jdchoi77@gmail.com})
 */
public class MPTag
{
	public static final String JOINER = "+";
	
	/** Inflectional suffix: noun, plural. */
	public static final String ISS = "ISS";
	/** Inflectional suffix: verb, 3rd-person singular. */
	public static final String ISZ = "ISZ";
	/** Inflectional suffix: verb, past (participial). */
	public static final String ISD = "ISD";
	/** Inflectional suffix: verb, gerund/progressive. */
	public static final String ISG = "ISG";
	/** Inflectional suffix: adjective/adverb, comparative. */
	public static final String ISR = "ISR";
	/** Inflectional suffix: adjective/adverb, superlative. */
	public static final String IST = "IST";
	
	/** Verb derivational suffix. */
	public static final String DSV = "DSV";
	/** Noun derivational suffix. */
	public static final String DSN = "DSN";
	/** Adjective derivational suffix. */
	public static final String DSJ = "DSJ";
	/** Adverb derivational suffix. */
	public static final String DSR = "DSR";
	
	/** Irregular form. */
	public static final String LATIN = "LT";
	
	public static String join(String... tags)
	{
		return UTArray.join(tags, JOINER);
	}
}