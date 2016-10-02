/*
 * Copyright (c) 2016. See AUTHORS file.
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

package com.mbrlabs.mundus.commons.assets;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Disposable;

/**
 * @author Marcus Brummer
 * @version 01-10-2016
 */
public abstract class Asset implements Disposable {

    protected FileHandle file;
    private MetaFile meta;

    public Asset(MetaFile meta, FileHandle assetFile) {
        this.meta = meta;
        this.file = assetFile;
    }

    public MetaFile getMeta() {
        return meta;
    }

    public String getName() {
        return meta.getFile().name();
    }

    public FileHandle getFile() {
        return file;
    }

    public String getUUID() {
        return meta.getUuid();
    }

    @Override
    public String toString() {
        return "[" + meta.getType().toString() + "] " + file.name();
    }

    public abstract void load();

}
