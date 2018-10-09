/**
 * Copyright 2013 Dennis Ippel
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.rajawali3d.bounds;

import org.rajawali3d.Geometry3D;
import org.rajawali3d.Object3D;
import org.rajawali3d.cameras.Camera;
import org.rajawali3d.math.Matrix4;

public interface IBoundingVolume {

    public static final int DEFAULT_COLOR = 0xFFFFFF00;

    public void calculateBounds(Geometry3D geometry);

    public void drawBoundingVolume(Camera camera, final Matrix4 vpMatrix, final Matrix4 projMatrix,
                                   final Matrix4 vMatrix, final Matrix4 mMatrix);

    public void transform(Matrix4 matrix);

    public boolean intersectsWith(IBoundingVolume boundingVolume);

    public Object3D getVisual();

    public int getBoundingColor();

    public void setBoundingColor(int color);
}

