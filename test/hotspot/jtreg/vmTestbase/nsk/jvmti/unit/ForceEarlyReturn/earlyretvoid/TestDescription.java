/*
 * Copyright (c) 2018, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/jvmti/unit/ForceEarlyReturn/earlyretvoid.
 * VM Testbase keywords: [quick, jpda, jvmti, noras, feature_jdk6_jpda, vm6]
 * VM Testbase readme:
 * DESCRIPTION
 *     The test exercises JVMTI function ForceEarlyReturnVoid(thread).
 *     The test creates a child thread setting breakpoint to the method
 *     checkPoint, then starts the thread which does the following:
 *         - recursively calls method countDown
 *         - at the end of recursion calls method checkPoint
 *     Hitting breakpoint in method checkPoint, the test enables single step
 *     and does ForceEarlyReturnVoid, then through incoming step events
 *     repeats ForceEarlyReturnVoid until method run on the way checking actual
 *     class/method/location/argument on expected values.
 * COMMENTS
 *     This test was cloned and adjusted for ForceEarlyReturn case from one
 *     of the PopFrame tests.
 *
 * @library /vmTestbase
 *          /test/lib
 *
 * @comment make sure earlyretvoid is compiled with full debug info
 * @build nsk.jvmti.unit.ForceEarlyReturn.earlyretvoid
 * @clean nsk.jvmti.unit.ForceEarlyReturn.earlyretvoid
 * @compile -g:lines,source,vars ../earlyretvoid.java
 *
 * @run main/othervm/native -agentlib:earlyretvoid nsk.jvmti.unit.ForceEarlyReturn.earlyretvoid
 */

