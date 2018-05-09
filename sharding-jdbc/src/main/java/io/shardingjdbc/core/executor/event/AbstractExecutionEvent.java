/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package io.shardingjdbc.core.executor.event;

import com.google.common.base.Optional;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * SQL execution event.
 *
 * @author zhangliang
 */
public abstract class AbstractExecutionEvent {
    
    @Getter
    private final String id = UUID.randomUUID().toString();
    
    @Getter
    @Setter
    private EventExecutionType eventExecutionType = EventExecutionType.BEFORE_EXECUTE;
    
    @Setter
    private Exception exception;
    
    /**
     * Get exception.
     * 
     * @return exception
     */
    public Optional<? extends Exception> getException() {
        return Optional.fromNullable(exception);
    }
}