/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.spritekit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKPhysicsJointLimit/*</name>*/ 
    extends /*<extends>*/SKPhysicsJoint/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKPhysicsJointLimitPtr extends Ptr<SKPhysicsJointLimit, SKPhysicsJointLimitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKPhysicsJointLimit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKPhysicsJointLimit() {}
    protected SKPhysicsJointLimit(Handle h, long handle) { super(h, handle); }
    protected SKPhysicsJointLimit(SkipInit skipInit) { super(skipInit); }
    public SKPhysicsJointLimit(SKPhysicsBody bodyA, SKPhysicsBody bodyB, @ByVal CGPoint anchorA, @ByVal CGPoint anchorB) { super((Handle) null, create(bodyA, bodyB, anchorA, anchorB)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxLength")
    public native @MachineSizedFloat double getMaxLength();
    @Property(selector = "setMaxLength:")
    public native void setMaxLength(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "jointWithBodyA:bodyB:anchorA:anchorB:")
    protected static native @Pointer long create(SKPhysicsBody bodyA, SKPhysicsBody bodyB, @ByVal CGPoint anchorA, @ByVal CGPoint anchorB);
    /*</methods>*/
}
